package PDF_Report;


import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author Stefan Ronnkvist
 */
public class PDFMaker {

    static String[] titleLine = {"American Postal Workers Union AFL-CIO", "STEP 1 GRIEVANCE", "OUTLINE WORKSHEET", "HQ Revised 04/24/12"};

    static String[][] lineValues = {
        {"GRIEVANT/PERSON OR UNION (Last Name First)", "ADDRESS", "CITY", "STATE", "ZIP", "PHONE NO."},
        {"EIN", "CRAFT", "STATUS", "LEVEL", "STEP", "DUTY HOURS", "OFF DAYS", "E-MAIL"},
        {"JOB NO/PAY LOCATION (UNIT/SECTION/CRAFT/STATION/OFFICE)", "POSTAL INSTALLATION LEVEL", "WORK LOCATION CITY AND ZIP CODE", "SENIORITY", "PREF. ELIGIBLE"},
        {"DISCIPLINE", "CONTRACT", "DATE", "LOCAL GRIEVANCE NO."},
        {"UNIT/SECTION/BRANCH/STATION/OFFICE", "INCIDENT DATE/TIME", "USPS REP - SUPR", "GRIEVANT AND/ OR STEWARD"},
        {"STEP 1 DECISION BY (NAME AND TITLE)", "DATE/TIME", "INITIALS (ONLY VERIFIES DATE OF DECISION)"}
    };

    static String[][] lineAnswersValues = {
        {"Ronnkvist, Stefan", "XXX Road Street", "Saint Peter", "Minnesota", "56789-1234", "(555) 555-5555"},
        {"123456789", "Maintenance", "Employed", "10", "O", "06:00", "Sat/Sun", "mark.me@email.com"},
        {"Mankato P&DF", "21", "Mankato 56001", "08/24/2002", "Yes"},
        {"N/A", "Article 19", "08/03/2018", "01-18-19-SR"},
        {"Mankato P&DF", "08/03/2018 06:00AM", "Robert Miller", "Stefan Ronnkvist"},
        {"Dustin Devens SMO", "08/03/2018", "DDD"}
    };

    static String[][] paragraphAnswersValues = {
        {"The origin of labor unions dates back to the eighteenth century and the industrial revolution in Europe. During this time there was a huge surge of new workers into the workplace that needed representation. In the United States history of unions, early workers and trade unions played an important part in the role for independence. Although their physical efforts for the cause of independence were ineffective, the ideas they introduced, such as protection for workers, became part of our American culture."},
        {"In the history of America's trade and labor unions, the most famous union remains the American Federation of Labor (AFL), founded in 1886 by Samuel Gompers. At its pinnacle, the AFL had approximately 1.4 million members. The AFL is credited with successfully negotiating wage increases for its members and enhancing workplace safety for all workers."},
        {"The labor movement in the United States grew out of the need to protect the common interest of workers. For those in the industrial sector, organized labor unions fought for better wages, reasonable hours and safer working conditions. The labor movement led efforts to stop child labor, give health benefits and provide aid to workers who were injured or retired."}
    };

    //these static global variables are instantiated allowing dynamic updates
    static Float insideRight = 0f;
    static Float insideLeft = 0f;
    static Float insideTop = 0f;
    static Float insideBottom = 0f;
    static Float borderValue = 20f;
    static Float topBorderValue = 30f;
    static PDFont font = PDType1Font.TIMES_ROMAN;
    static int fontSize = 9;
    static int fontSizeOffset = 2;
    static PDFont titleFont = PDType1Font.TIMES_BOLD;
    static int titleFontSize = 20;
    static PDFont subTitleFont = PDType1Font.TIMES_BOLD;
    static int subTitleFontSize = 5;

    //Entry point into class
    public void makeBaseDocument(String fileName) throws IOException {
        int pageNumber = 0;

        //creates base PDF Document
        PDDocument document = new PDDocument();
        PDPage blankPage = new PDPage();
        document.addPage(blankPage);
        PDPage page = document.getPage(pageNumber);
        PDPageContentStream contentStream;
        contentStream = new PDPageContentStream(document, page);

        //PDF Document details are created
        makePageOutline(page, contentStream);
        makePageTitleSection(page, contentStream, ++pageNumber);
        makePageLineText(contentStream);
        breakLinesIntoPageWidth(contentStream, paragraphAnswersValues[0][0]);
        contentStream.close();

        //Save PDF Document in suer folder of OS
        File file1 = new File(System.getProperty("user.dir") + "\\" + fileName);
        document.save(file1);
    }

    //getPhraseLength calculates the length of a string, not character length
    private static Float getPhraseLength(String stringValue, PDFont font, int fontSize) throws IOException {
        return font.getStringWidth(stringValue) / 1000 * fontSize;
    }

    //putTextOnDocument places text on document at a specific position
    private static void putTextOnDocument(PDPageContentStream contentStream, String stringValue, PDFont font, int fontSize, Float horizontalPixel, Float verticalPixel) throws IOException {
        contentStream.setNonStrokingColor(Color.BLACK);
        contentStream.beginText();
        contentStream.setFont(font, fontSize);
        contentStream.newLineAtOffset(horizontalPixel, verticalPixel);
        contentStream.showText(stringValue);
        contentStream.endText();
        contentStream.stroke();
    }

    //drawLineOnDocument draws a line on document between coordinates
    private static void drawLineOnDocument(PDPageContentStream contentStream, Float X1, Float Y1, Float X2, Float Y2) throws IOException {
        contentStream.setNonStrokingColor(Color.BLACK);
        contentStream.moveTo(X1, Y1);
        contentStream.lineTo(X2, Y2);
        contentStream.setLineWidth(1);
        contentStream.stroke();

    }

    //breakLinesIntoPageWidth breaks a long string into multiple lines that are narrower than inside document width
    private static void breakLinesIntoPageWidth(PDPageContentStream contentStream, String longLine) throws IOException {
        Float maxWidth = insideRight - insideLeft;
        ArrayList<String> al = new ArrayList<String>();
        al.add("Background:");
        int j = 0, i = 0, k = 0;
        for (i = 0; i < longLine.length(); i++) {
            if (getPhraseLength(longLine.substring(j, i), font, fontSize) > (maxWidth - 12)) {
                al.add(longLine.substring(j, i).trim());
                j = i;
            }
        }
        al.add(longLine.substring(j).trim());
        System.out.println(maxWidth);
        for (String value : al) {
            putTextOnDocument(contentStream, value, font, fontSize, borderValue + 5, (insideTop - 150) - (15 * k++));
        }
        drawLineOnDocument(contentStream, insideLeft, (insideTop - 150) - (k * 15), insideRight, (insideTop - 150) - (k * 15));
    }

    //makePageLineText determines the horizontal position of two text strings width different lengths and font size to maintain vertical alignment and equally spaced across document
    private static void makePageLineText(PDPageContentStream contentStream) throws IOException {
        if (lineAnswersValues.length == lineValues.length) {
            // this section determines the padding between text strings along the horizontal two row sequences
            Float[] textPadding = new Float[lineAnswersValues.length];
            for (int i = 0; i < lineAnswersValues.length; i++) {
                Float lineTextLength = 0f;
                for (int j = 0; j < lineValues[i].length; j++) {
                    if (lineAnswersValues[i].length == lineValues[i].length) {
                        lineTextLength = lineTextLength + (Math.max(getPhraseLength(lineAnswersValues[i][j], font, fontSize), getPhraseLength(lineValues[i][j], font, fontSize - 2)));
                    }
                }
                textPadding[i] = (insideRight - insideLeft - 4 - lineTextLength) / (lineValues[i].length - 1);
            }
            // this section determines the position across the horizontal row by combining text string length and padding
            for (int i = 0; i < lineValues.length; i++) {
                Float textPosition = 22f;
                for (int j = 0; j < lineValues[i].length; j++) {
                    if (j != 0) {
                        textPosition = textPosition + textPadding[i] + Math.max(getPhraseLength(lineAnswersValues[i][j - 1], font, fontSize), getPhraseLength(lineValues[i][j - 1], font, fontSize - 2));
                    }
                    putTextOnDocument(contentStream, lineValues[i][j], font, fontSize-fontSizeOffset, textPosition, insideTop - 6 - (i * 23));
                    putTextOnDocument(contentStream, lineAnswersValues[i][j], font, fontSize, textPosition, insideTop - 19 - (i * 23));
                    drawLineOnDocument(contentStream, insideLeft, insideTop - 22 - (i * 23), insideRight, insideTop - 22 - (i * 23));
                }
            }
        }
    }

    //makePageTitleSection calculates the center position of main title and two row side sub titles
    private static void makePageTitleSection(PDPage page, PDPageContentStream contentStream, int pageNumber) throws IOException {
        Float insideTitleRight = page.getMediaBox().getWidth();
        Float insideTitleTop = page.getMediaBox().getHeight();
        Float titleOffset = (insideTitleRight - getPhraseLength(titleLine[0], titleFont, titleFontSize)) / 2;
        putTextOnDocument(contentStream, titleLine[0], PDType1Font.TIMES_BOLD, titleFontSize, titleOffset, insideTitleTop - topBorderValue + 5);
        Float titleTwoOffset = getPhraseLength(titleLine[1], subTitleFont, subTitleFontSize);
        putTextOnDocument(contentStream, titleLine[1], PDType1Font.TIMES_BOLD, subTitleFontSize, insideRight - titleTwoOffset - 1, insideTitleTop - topBorderValue / 2);
        Float titleThreeOffset = getPhraseLength(titleLine[2], subTitleFont, subTitleFontSize);
        putTextOnDocument(contentStream, titleLine[2], PDType1Font.TIMES_BOLD, subTitleFontSize, insideRight - titleThreeOffset - 1, insideTitleTop - topBorderValue + 5);
        putTextOnDocument(contentStream, "Page " + pageNumber, font, fontSize, insideTitleRight / 2, borderValue / 3);
    }

    //makePageOutline draws a border around document
    private static void makePageOutline(PDPage page, PDPageContentStream contentStream) throws IOException {
        insideRight = page.getMediaBox().getWidth() - borderValue;
        insideLeft = borderValue;
        insideTop = page.getMediaBox().getHeight() - topBorderValue;
        insideBottom = borderValue;
        drawLineOnDocument(contentStream,insideLeft, insideBottom,insideLeft, insideTop);
        drawLineOnDocument(contentStream,insideLeft, insideTop,insideRight, insideTop);
        drawLineOnDocument(contentStream,insideRight, insideTop,insideRight, insideBottom);
        drawLineOnDocument(contentStream,insideRight, insideBottom,insideLeft, insideBottom);
    }
}
