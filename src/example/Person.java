package example;

public class Person {
    public static Person create(String gender){
        Person p = new Person();
        if ("male".equals(gender)){
            p.setTitle("Mr");
            p.setGender("M");
;       }
        else{
            p.setTitle("Ms");
            p.setGender("F");
        }
        return p;
    }

    private void setGender(String m) {
    }

    private void setTitle(String mr) {
    }
}
