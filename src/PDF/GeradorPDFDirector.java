package PDF;

public class GeradorPDFDirector {
    private BuilderInterfaceGeradorPDF builderGeradorPDF;

    public GeradorPDFDirector(BuilderInterfaceGeradorPDF builder) {
        this.builderGeradorPDF = builder;
    }

    public void setBuilderGeradorPDF(BuilderInterfaceGeradorPDF builder) {
        this.builderGeradorPDF = builder;
    }

    public void criarGeradorPDF() {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
        this.builderGeradorPDF.setHeader();
        this.builderGeradorPDF.setFooter();
    }

    public void criarGeradorPDFNotHeader() {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
        this.builderGeradorPDF.setFooter();
    }
    public void criarGeradorPDFNotFooter()
    {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
        this.builderGeradorPDF.setHeader();
    }

    public void criarGeradorPDFNotHeaderNotFooter()
    {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
    }
}
