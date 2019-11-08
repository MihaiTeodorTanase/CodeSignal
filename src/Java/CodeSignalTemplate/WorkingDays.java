package CodeSignalTemplate;

import java.util.LinkedList;
import java.util.List;

public class WorkingDays {
    public static void main(String[] args) {
        int x = 670550400;
        System.out.println(asdads(x));
    }

    static String asdads(int x) {
        int counter = 0;
        int[] zilePerLuna = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int zile = x / (60 * 60 * 24);
        int zileRememberer = zile;
        int zileDinLunaCurenta = 0;
        int zileLucratoareCounter=0;
        boolean bisect = true;

        //Daca numarul de zile este mai mare decat un an scadem anul(anii)(in functie si de an bisect) sa avem numarul de zile mai mic decat 365
        //asta insemnand ca in anul prezent sunt atatea zile pana in ziua de 1 a lunii x(inclusiv ziua de 1)

            while (zile > 365) {
                if (bisect) {
                    zile = zile - 366;
                    bisect = false;
                    counter = 0;
                } else {
                    zile = zile - 365;
                    if (++counter == 4) {
                        bisect = true;
                    }
                }
            }


        // aici se numara numarul de luni pana la ziua prezenta, ziua 1 din luna x
        int index = 0;
        int counterLuni = 0;
        while (zile > 1) { //aici zile>1 pentru 1 este ziua prezenta
            if (index == 1 && bisect) {
                zilePerLuna[1] = 29;
            } else if (index == 1 && !bisect) {
                zilePerLuna[1] = 28;
            }
            zile = zile - zilePerLuna[index];
            index++;
            counterLuni++;
        }

        //aici in functie de a cata luna suntem stabilesc nr de zile maxime
        if(counterLuni==0){
            //ianuarie
            zileDinLunaCurenta=31;
        }
        if(counterLuni==1){
            //februarie
            if(bisect){zileDinLunaCurenta=29;}
            else{zileDinLunaCurenta=28;}
        }
        if(counterLuni==2){
            //martie
            zileDinLunaCurenta=31;
        }
        if(counterLuni==3){
            //aprilie
            zileDinLunaCurenta=30;
        }
        if(counterLuni==4){
            //mai
            zileDinLunaCurenta=31;
        }
        if(counterLuni==5){
            //iunie
            zileDinLunaCurenta=30;
        }
        if(counterLuni==6){
            //iulie
            zileDinLunaCurenta=31;
        }
        if(counterLuni==7){
            //august
            zileDinLunaCurenta=31;
        }
        if(counterLuni==8){
            //septembrie
            zileDinLunaCurenta=30;
        }
        if(counterLuni==9){
            //octombrie
            zileDinLunaCurenta=31;
        }
        if(counterLuni==10){
            //noiembrie
            zileDinLunaCurenta=30;
        }
        if(counterLuni==11){
            //decembrie
            zileDinLunaCurenta=31;
        }

        //aici stabilesc in ce zi pica ziua 1 din luna x scazand din nr total de zile din anul prezent determinat sus mereu cate 7 pana ajunge sub 7
        zile=zileRememberer;
        while(zile>7){
            zile=zile-7;
        }

        //stabilesc zilele de odihna in functie de in ce zi pica ziua 1 din luna x
        int[] zileOdihna = {0,0};
        if(zile==0){
            //marti
            zileOdihna[0]=5;
            zileOdihna[1]=6;
        }
        if(zile==1){
            //miercuri
            zileOdihna[0]=4;
            zileOdihna[1]=5;
        }
        if(zile==2){
            //joi
            zileOdihna[0]=3;
            zileOdihna[1]=4;
        }
        if(zile==3){
            //vineri
            zileOdihna[0]=2;
            zileOdihna[1]=3;
        }
        if(zile==4){
            //sambata
            zileOdihna[0]=1;
            zileOdihna[1]=2;
        }
        if(zile==5){
            //duminica
            zileOdihna[0]=1;
            zileOdihna[1]=7;
        }
        if(zile==6){
            //luni
            zileOdihna[0]=6;
            zileOdihna[1]=7;
        }

        //in functie de cate zile sunt in luna curenta numar zilele lucratoare tinand cont de zilele de odihna
         for(int i = 1 ; i <= zileDinLunaCurenta ;i++){
             if(zileOdihna[0]!=i && zileOdihna[1]!=i){
                 zileLucratoareCounter++;
             }
             if(i==7){
                 i=0;
                 zileDinLunaCurenta-=7;
             }
         }
         return "Zile lucratoare: "+zileLucratoareCounter;
    }
}
