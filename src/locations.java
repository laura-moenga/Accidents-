public class Location{
    private  String Locationid;
    private String Type;
    private String name;

    public Location(int Locationid, String Type, String name){
        this.Locationid = Locationid;
        this.Type = Type;
        this.name = name;
    }
    public String getLocationid() {
        return Locationid;
    }
    public void setLocationid(String Locationid) {
        this.Locationid = Locationid;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

}