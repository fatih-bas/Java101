public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    int c1SozluNotu;
    int c2SozluNotu;
    int c3SozluNotu;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes,
            Course c1, Course c2, Course c3) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c1SozluNotu = 0;
        this.c2SozluNotu = 0;
        this.c3SozluNotu = 0;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int c1SozluNotu, int c2SozluNotu, int c3SozluNotu ) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.c1.sozluNotu = c1SozluNotu;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.c2.sozluNotu = c2SozluNotu;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.sozluNotu = c3SozluNotu;
        }
    }

    void isPass() {
        this.average =
                ((this.c1.note * 0.80 + this.c1.sozluNotu * 0.20) +
                (this.c2.note * 0.80 + this.c2.sozluNotu * 0.20) +
                (this.c3.note * 0.80 +  this.c2.sozluNotu * 0.20)) / 3.0;

        if (this.average > 55) {
            System.out.println("Sınıfı geçtiniz");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(this.c1.name + " Notu          : " + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu    : " + this.c1.sozluNotu);
        System.out.println(this.c2.name + " Notu          : " + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu    : " + this.c2.sozluNotu);
        System.out.println(this.c3.name + " Notu       : " + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu : " + this.c3.sozluNotu);
        System.out.println("Ortalamanız         : " + this.average);
    }
}