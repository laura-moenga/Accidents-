public class accidents{
    private int accident_id;
    private int location_id;
    private String Date;
    private String Cause;
    private int fatalilites;

    public accidents(int accident_id, int location_id, String Date, String Cause, int fatalilites){
        this.accident_id = accident_id;
        this.location_id = location_id;
        this.Date = Date;
        this.Cause = Cause;
        this.fatalilites = fatalilites;
    }
    public int getAccident_id() {
        return accident_id;
    }
    public int getLocation_id() {
        return location_id;
    }
    public String getDate() {
        return Date;
    }
    public String getCause() {
        return Cause;
    }
    public int getFatalilites() {
        return fatalilites;
    }
}