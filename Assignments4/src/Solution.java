public class Solution {
    public static void main(String[] args) {
        //1
       Swimmer noa = new Swimmer();
       noa.swim();
        //2
       noa.speciality();

        //3
        //התכנית לא תרוץ כיוון שלא ניתן ליצור אובייקט של class אבסטרקטי (הרי הוא לא מוחשי)

        //4
        // תהיה שגיאה כיוון לא ניתן להגדיר class אבסטרקטי כfinal

        //5
        System.out.println(Ball.isRound);
        //Ball.isRound = false;

        //6
        //לא ניתן להגדיר משתנה סטטי בתוך פונקציה

        //7+8
       WhitePony flash = new WhitePony("flash", 10);
       flash.bite();
       System.out.println(flash.getPonyColor());

        //9
         //בגאווה מחלקה לא יכולה לרשת ממספר מחלקות

        //10
        //שתי המחלקות לא נמצאות באותו package ולכן המחלקה apple לא מכירה את המחלקה dog
        //התיקון יכול להיות ע"י הוספת import לdog

        //11
        //המתודה bark היא protected ולכן ניתן לעשות בה שימוש רק במחלקה שתירש את המחלקה dog
        //לרשת את הממחלקה dog מהמחלקה apple

        //12
        //whaf - puppy

        //13
        //אנחנו לא נקרא לgarbage collection, זה רץ אוטומטית

        //14
        //D

        //15
        //ניתן להשתמש במנגנון try-finally כשאנחנו לא מעוניינים לתפוס את הexception

        //16
        //יקפוץ exception

        //17
        //אמנם המילה const היא מילה שמורה אך אין בה שימוש בjava

        //18
        //קונספט שמחלקה ב יורשת מ-א, מחלקה ג יורשת מ-ב ומחלקה א יורשת מ-ג
        //זה לא אפשרי בגאווה
        //מימוש במחלקה A,B,C
    }
}

