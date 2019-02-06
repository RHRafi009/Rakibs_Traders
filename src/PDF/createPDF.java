/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF;

import static com.itextpdf.kernel.pdf.PdfName.Font;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.text.Anchor;
import static com.itextpdf.text.Annotation.FILE;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.*;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.sun.scenario.effect.ImageData;
import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.print.attribute.standard.MediaTray;
import javax.print.attribute.standard.SheetCollate;
import javax.print.attribute.standard.Sides;
import java.io.IOException;
/**
 *
 * @author yeasin
 */
public class createPDF {
    
//    File file = new File("K:/PDF/test.pdf");
    String date = "", ID = "", cName = "",cPhone = "", cID = "", TotalPaid = "",Due = "",Discount = "",Labour = ""
            ,NetAmount = "",Total = "",Change = "" ;
   
    private JTable productTable = new JTable();
    
    
    public void setData(String date, String ID, String cName, String cPhone ,
            String cID,  JTable productTable,
            String total, String discount, String labour, String NetAmount , 
            String paid , String change , String Due ){
        
        this.date = date.substring(date.indexOf("M") + 1 );
        this.ID = ID;
        this.cName = cName;
        this.cPhone = cPhone;
        this.cID = cID;
        this.productTable = productTable;
        this.TotalPaid= paid;
        this.Discount = discount;
        this.Labour = labour;
        this.NetAmount = NetAmount;
        this.Total = total;
        this.Change = change;
        this.Due = Due;
    }
    
    public static final String IMG = "E:/study/Projects/Rakib Traders/Code/V 1.0.3.4/PDF/Icon.jpg";
    public static final String SRC = "E:/study/Projects/Rakib Traders/Code/V 1.0.3.4/PDF/test.pdf";
    private static Font catFont = new Font(FontFamily.COURIER, 18);
    private static Font redFont = new Font(FontFamily.HELVETICA, 10);
    private static Font small = new Font(FontFamily.HELVETICA, 9);
    private static Font smallBold = new Font(FontFamily.TIMES_ROMAN, 11);
    public static String FILE ;
    
    public void setFileName( String name ){
        this.FILE = name;
    }
    
    public static void printPdf() throws FileNotFoundException, PrintException, IOException{
//        PdfDocument d = new PdfDocument();
            Desktop desktop = Desktop.getDesktop();
            File file = new File(FILE);
             if(file.exists()) desktop.open(file);

            if(!Desktop.isDesktopSupported()){
                System.out.println("Desktop is not supported");
                return;
            }
    }
    
    
    public void gen(){
        
        try {
            float left = 30;
            float right = 30;
            float top = 30;
            float bottom = 0;
            setFileName("E:/study/Projects/Rakib Traders/Code/V 1.0.3.4/PDF/" + ID + ".pdf");
            Document document = new Document(PageSize.A4, left, right, top, bottom);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.setMargins(50, 50, 50, 50);
            document.open();
            PdfContentByte cb = writer.getDirectContent();
            PdfReader reader = new PdfReader(SRC);
            PdfImportedPage page = writer.getImportedPage(reader, 1);
            
            document.newPage();
            cb.addTemplate(page, 0, 0);
            
            PdfPTable table1 = new PdfPTable(1);
            Paragraph custName = new Paragraph("Name: " + cName   + "    Phone: " + cPhone + "\n\n" + "CID:  " + cID  + "  \n\n" ,small);
            custName.setAlignment(Element.ALIGN_RIGHT);
            table1.addCell(custName);
            table1.setWidthPercentage(50);
            table1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            
            Paragraph Empty = new Paragraph("\n",redFont);
            Empty.setAlignment(Element.ALIGN_RIGHT);
            Empty.setLeading(20);
            
            Image logo = Image.getInstance(IMG);
            logo.setAbsolutePosition(50, 720);
            logo.setAlignment(Element.ALIGN_LEFT);
             document.add(Empty);
             document.add(Empty);
             document.add(Empty);

            document.add(table1);

            
            Paragraph p = new Paragraph("");
            DottedLineSeparator dottedline = new DottedLineSeparator();
            dottedline.setOffset(-2);
            dottedline.setGap(2f);
            p.add(dottedline);
            document.add(p);
            
            Paragraph InvoiceID = new Paragraph("Date: " + date + "                                                                                                                                            " + ID ,small);
            
            InvoiceID.setKeepTogether(true);
            InvoiceID.setAlignment(Element.ALIGN_LEFT);
            document.add(Empty);
            document.add(InvoiceID);
            document.add(Empty);
            
            
            
            PdfPTable table = new PdfPTable(9);
            PdfPCell c1 = new PdfPCell(new Phrase("PID",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            document.add(Empty);
            
            c1 = new PdfPCell(new Phrase("Company Name",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("Model",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("BOX",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("PCS",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("Feet",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("Unit",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("Unit Price",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("Total",smallBold));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.setWidthPercentage(100);
            table.setHeaderRows(1);
            
            // limit is 40 rows
            
            for( int i=0; i < productTable.getRowCount(); i++ ){
                for( int j=0; j<=8; j++ ){
//                    System.err.print ( productTable.getModel().getValueAt(i, j) + " asdfads ");
                    table.addCell(new PdfPCell(new Phrase((productTable.getModel().getValueAt(i, j)) + "",small)));
                }
            }
            table.getAbsoluteWidths();
            document.add(table);
            document.add(Empty);
            
            
            Paragraph total = new Paragraph("TOTAL : " + this.Total + "Tk", smallBold);
            Paragraph disc = new Paragraph("Discount : " + this.Discount + "Tk", smallBold);
            Paragraph labour = new Paragraph("Labour Cost:  " + this.Labour + "Tk", smallBold);
            Paragraph netAmount = new Paragraph("Net Amount : " +this.NetAmount + "Tk", smallBold);
            Paragraph paid = new Paragraph("Total Paid : " + this.TotalPaid + "Tk" , smallBold);
            Paragraph change = new Paragraph("Change : " + this.Change + "Tk", smallBold);
            Paragraph Due = new Paragraph("Due : " + this.Due + "Tk", smallBold);
            Paragraph Signature = new Paragraph("------------------------\n    SIGNATURE", smallBold);
            
            total.setAlignment(Element.ALIGN_RIGHT);
            disc.setAlignment(Element.ALIGN_RIGHT);
            labour.setAlignment(Element.ALIGN_RIGHT);
            netAmount.setAlignment(Element.ALIGN_RIGHT);
            paid.setAlignment(Element.ALIGN_RIGHT);
            change.setAlignment(Element.ALIGN_RIGHT);
            Due.setAlignment(Element.ALIGN_RIGHT);
            Signature.setAlignment(Element.ALIGN_LEFT);
            
            
            document.add(total);
            if( Double.parseDouble(this.Discount) > 0.0 )document.add(disc);
            document.add(labour);
            document.add(netAmount);
            document.add(paid);
            document.add(change);
            document.add(Due);
            document.add(Empty);
            document.add(Signature);
            
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
