package PDF_Report;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.graphics.xobject.*;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.*;


public class PDFExample {   

    public static void main(String[] args){
    // Create a document and add a page to it
    try {
    PDDocument document = new PDDocument();
    PDPage page = new PDPage();
    document.addPage(page); 

    // Image to use 
    PDXObjectImage img = new PDJpeg(document, new FileInputStream( new File("C://213480-EligibilityFormHeader.jpg") ) );

    // Create a new font object selecting one of the PDF base fonts
    PDFont font = PDType1Font.HELVETICA_BOLD;

    // Start a new content stream which will "hold" the to be created content
    PDPageContentStream contentStream = new PDPageContentStream(document, page,true,true);

    contentStream.setFont( font, 6 );
    contentStream.drawImage(img, 25, 700);

    drawTable( page,  contentStream );

    // Make sure that the content stream is closed
    contentStream.close();

    // Save the results and ensure that the document is properly closed
    document.save( "C://HelloWorld.pdf");
    document.close();
    } catch (Exception e) {
        System.out.println("Exception is: ");
    }
    }

    private static void drawTable( PDPage page, PDPageContentStream contentStream) {
        try {
            float y = 650;
            float margin = 130;

            String[] content = {"One","Two", "Date", "Score", "Score2", "Score3", "Score4", "Score5", "Score6"};

            final int rows = content.length;
            final int cols = 2;
            final float rowHeight = 22f;
            final float tableHeight = rowHeight * rows;
            final float cellMargin=1f;

            //draw the rows
            float nexty = y ;
            for (int i = 0; i <= rows; i++)
            {
                contentStream.drawLine(margin, nexty, 400, nexty);
                nexty-= rowHeight;
            }

            float colWidthX [] = {200,70,0};

            //draw the columns
            float nextx = margin;
            for (int i = 0; i <= cols; i++)
            {
                contentStream.drawLine(nextx, y, nextx, y-tableHeight);
                nextx += colWidthX[i] ; //colWidth;
            }

            //now add the text
            float textx = margin+cellMargin;
            float texty = y-15;
            //textx = margin+cellMargin;


                for(int j = 0 ; j < rows; j++) {
                    contentStream.beginText();
                    contentStream.moveTextPositionByAmount(textx,texty);

                    contentStream.drawString(content[j]);
                    contentStream.endText();
                    textx += colWidthX[0]+9;
                    contentStream.beginText();
                    contentStream.moveTextPositionByAmount(textx,texty);
                    if(j==0)
                        contentStream.drawString( "1" );
                    if(j==1)
                        contentStream.drawString( "12345" );
                    if(j==2)
                        contentStream.drawString( "05-December-2003" );
                    if(j==3)
                        contentStream.drawString( "15" );
                    if(j==4)
                        contentStream.drawString( "1" );
                    if(j==5)
                        contentStream.drawString( "1" );
                    if(j==6)
                        contentStream.drawString( "1" );
                    if(j==7)
                        contentStream.drawString( "1" );
                    if(j==8)
                        contentStream.drawString( "1" );

                    contentStream.endText();
                    textx = margin+cellMargin; //colWidth;
                    texty -= rowHeight; //row height

                }
                texty-=rowHeight;
                textx = margin+cellMargin;
        }
        catch ( IOException ioe )
        {
            //Package.log.error( " drawTable :" + ioe);
            final String errormsg = "Could not drawTable ";
            //Package.log.error("In RuleThread drawTable " + errormsg, ioe);
            throw new RuntimeException(errormsg, ioe);
        }
        catch ( Exception ex )
        {
            //Package.log.error( " drawTable :" + ex);
            final String errormsg = "Could not drawTable ";
            //Package.log.error("In RuleThread drawTable " + errormsg, ex);
            throw new RuntimeException(errormsg, ex);
        }
    }


}