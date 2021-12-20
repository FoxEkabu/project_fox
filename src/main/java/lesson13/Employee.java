package lesson13;

public class Employee {

    private String fio;
    private Integer tabNumber;
    private Integer generalWorkExperience;

    @Override
    public String toString() {
        return "Работник{" +
                "ФИО='" + fio + '\'' +
                ", Табельный номер=" + tabNumber +
                ", Стаж работы=" + generalWorkExperience +
                '}'+"\n";
    }

    public Employee(String fio, Integer tabNumber, Integer generalWorkExperience) {
        this.fio = fio;
        this.tabNumber = tabNumber;
        this.generalWorkExperience = generalWorkExperience;
    }

    public String getFio() {
        return fio;
    }

    public Integer getTabNumber() {
        return tabNumber;
    }

    public Integer getGeneralWorkExperience() {
        return generalWorkExperience;
    }
}
