package BubbleSort;

public class Hero {
    private String[] dataHero;

    public Hero() {
    }

    public String[] getData() { return dataHero; }

    public void setData(String[] data) {
        this.dataHero = data;
    }

    public void sortData() {
        int Hero = this.dataHero.length;
        for (int i = 0;i<Hero;i++) {
            for (int j=i+1;j<Hero;j++) {
                if (this.dataHero[j]. compareTo(this.dataHero[i]) > 0) {
                    String temp = this.dataHero[i];
                    this.dataHero[i] = this.dataHero[j];
                    this.dataHero[j] = temp;
                }
            }
        }
    }

    public void PrintData() {
        for (String datum : this.dataHero) {
            System.out.println(datum+" ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"spiderman","superman","batman","wonderwoman","gundala"};
        Hero _myBubble = new Hero();
        _myBubble.setData(nama);
        _myBubble.sortData();
        _myBubble.PrintData();
    }
}