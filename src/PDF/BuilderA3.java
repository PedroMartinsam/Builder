package PDF;


public class BuilderA3 implements BuilderInterfaceGeradorPDF{
    private GeradorPDF geradorPDF;

    public BuilderA3() {
        this.geradorPDF = new GeradorPDF();
    }

    @Override
    public GeradorPDF getGeradorPDF() {
        return this.geradorPDF;
    }

    @Override
    public void setFooter() {
        this.geradorPDF.hasFooter = true;
        this.geradorPDF.footerHeight = 15;
    }

    @Override
    public void setHeader() {
        this.geradorPDF.hasHeader = true;
        this.geradorPDF.headerHeight = 15;
    }

    @Override
    public void setMargin()
    {
        this.geradorPDF.marginLeft = 20;
        this.geradorPDF.marginRight = 20;
        this.geradorPDF.marginBottom = 30;
        this.geradorPDF.marginTop = 30;
    }

    @Override
    public void setPageConfiguration()
    {
        this.geradorPDF.pageOrientation = "portrait";
        this.geradorPDF.unit = "mm";
        this.geradorPDF.pageSizeX = 297;
        this.geradorPDF.pageSizeY = 420;
        this.geradorPDF.pageColor = "#FFFFFF";
        this.geradorPDF.encode = "UTF-8";
    }
}
