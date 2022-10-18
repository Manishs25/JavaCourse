package encapsulation;

public class EncapsulationDemo {
    private int id;

    private String name;

    private String address;

    public void setId(int id){
//        if(id==0){
//            System.out.println("Id is zero");
//        }{
            this.id=id;
        }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public int getId(){
        return id;
    }

    public String getAddress(){
        return address;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(1);
        obj.setName("Manish");
        obj.setAddress("Satara");

        System.out.println("id :"+obj.getId()+"name :"+obj.getName()+"Addrress :"+ obj.getAddress());
    }
}
