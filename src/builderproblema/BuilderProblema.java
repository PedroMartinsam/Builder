
package builderproblema;

import PDF.BuilderA3;
import PDF.BuilderA4;
import PDF.GeradorPDF;
import PDF.GeradorPDFAlternativo;


public class BuilderProblema {

    public static void main(String[] args) {
        BuilderA4 builderA4 = new BuilderA4();
        builderA4.setPageConfiguration();
        builderA4.setMargin();
        builderA4.setHeader();
        builderA4.setFooter();
        GeradorPDF pdfA4 = builderA4.getGeradorPDF();
        System.out.println(pdfA4.toString());

        BuilderA3 builderA3 = new BuilderA3();
        builderA3.setPageConfiguration();
        builderA3.setMargin();
        GeradorPDF pdfA3 = builderA3.getGeradorPDF();
        System.out.println(pdfA3.toString());
    }
    
}
