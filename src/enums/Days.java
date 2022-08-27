package enums;

public enum Days {
    MONDAY("Дуйшобу куну агайдан сабак!"),
    TUESDAY("Шейшемби куну англис тили болот!"),
    WEDNESDAY("Шаршемби куну soft skils сабагы болот!"),
    THURSDAY("Бейшемби куну evant болот!"),
    FRIDAY("Жума куну теннис ойнойбуз!"),
    SATURDAY("Ишемби куну практика кылабыз!"),
    SUNDAY("Жекшемби куну эс алуу!!");

    private String does;

    Days(String does) {
        this.does = does;
    }

    public String getDoes() {
        return does;
    }

    public void setDoes(String does) {
        this.does = does;
    }

    @Override
    public String toString() {
        return "{" + "does = '" + does + '\'' + '}';
    }
}
