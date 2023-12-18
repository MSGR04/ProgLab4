package characters;

import enuminterfaceses.*;

import java.util.Objects;

abstract class Characters {
    protected String Name;
    public Characters(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void doAction(DoAction a, String whom){
        String s = a.doSmth();
        if (a.PersonName().toString().equals(getClass().getSimpleName().toString())){
            System.out.println(this.Name + " " + s + " " + whom);
        }
        else{
            System.out.println("У этого персонажа нет такого действия");
        }

    }
    //проверка не учитывающая регистра
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters characters = (Characters) o;
        return Objects.equals(Name.toLowerCase(), characters.Name.toLowerCase()) && Objects.equals(this.Gender(), characters.Gender());
    }

    abstract String Gender();

    public String toString() {
        return "Character[" +
                "Name='" + Name + '\'' +
                ']';
    }
    public int hashCode() {
        return Objects.hash(Name);
    }
}
