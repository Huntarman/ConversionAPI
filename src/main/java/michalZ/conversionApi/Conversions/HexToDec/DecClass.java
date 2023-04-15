package michalZ.conversionApi.Conversions.HexToDec;

public class DecClass {
    private String dec;

    public DecClass(String hex){
        this.dec = String.valueOf(
                Integer.parseInt(hex,16));
    }

    public String getDec() {
        return dec;
    }

    public void setDec(int dec) {
        this.dec = String.valueOf(dec);
    }
}
