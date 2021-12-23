package lesson14;

public class PhoneBook {
    private String FIO;
    private int number;
    private boolean cellNumber;
    private int linkedNumber1;
    private int linkedNumber2;

    @Override
    public String toString() {
        return "Абонент{" +
                "ФИО='" + FIO + '\'' +
                ", номер=" + number +
                ", сотовый/городской=" + cellNumber +
                ", связанный номер 1=" + linkedNumber1 +
                ", связанный номер 2=" + linkedNumber2 +
                "}"+"\n";
    }

    public String getFIO() {
        return FIO;
    }

    public int getNumber() {
        return number;
    }

    public boolean isCellNumber() {
        return cellNumber;
    }

    public int getLinkedNumber1() {
        return linkedNumber1;
    }

    public int getLinkedNumber2() {
        return linkedNumber2;
    }

    public PhoneBook(String FIO, int number, boolean cellNumber, int linkedNumber1, int linkedNumber2) {
        this.FIO = FIO;
        this.number = number;
        this.cellNumber = cellNumber;
        this.linkedNumber1 = linkedNumber1;
        this.linkedNumber2 = linkedNumber2;
    }
}
