package com.mbk.learning;

record PersonalInfo(int uId, String name){}

/*class PersonalInfo {
    private final int uId;
    private final String name;

    public PersonalInfo(int uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public int getUid() {
        return uId;
    }

    public String getName() {
        return name;
    }
       
    public String toString() {
        return "PersonalInfo ojbect have uId = " + uId + "and name = " + name;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + uId;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

  
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        PersonalInfo other = (PersonalInfo) obj;
        if (uId != other.uId)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
}*/

public class RecordDemo {
    public static void main(String[] args) {
        PersonalInfo personalInfo1 = new PersonalInfo(1, "John Doe");
        PersonalInfo personalInfo2 = new PersonalInfo(1, "John Doe");
        
        System.out.println(personalInfo1.hashCode());
        System.out.println(personalInfo2.hashCode());
        
        System.out.println(Integer.toHexString(personalInfo1.hashCode()));
        System.out.println(Integer.toHexString(personalInfo2.hashCode()));

        System.out.println(personalInfo1.toString());
        System.out.println(personalInfo2.toString());

        System.out.println(personalInfo1.equals(personalInfo2));
    }
}
