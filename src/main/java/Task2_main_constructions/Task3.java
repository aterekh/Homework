/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Columns
 * and open the template in the editor.
 */
package Task2_main_constructions;
import java.util.Scanner;

/**
 *
 * @author Alina
 */
public class Task3 {
        public static void main(String[] args) {
        
        String[] firstColumn = new String[10];
        String[] secondColumn = new String[11];
        String[] thirdColumn = new String[11];
        String[] fourthColumn = new String[10];
        String whatToSay = "";
        int numberOfStrings;
        Scanner inputData = new Scanner(System.in);
        //1 столбец
        firstColumn[0]="Дорогие друзья! ";
        firstColumn[1]="C другой стороны ";
        firstColumn[2]="Равным образом ";
        firstColumn[3]="Не следует, однако, забывать о том, что ";
        firstColumn[4]="Таким образом, ";
        firstColumn[5]="Повседневная практика показывает, что ";
        firstColumn[6]="Значимость этих проблем настолько очевидна, что ";
        firstColumn[7]="Разнообразный и богатый опыт ";
        firstColumn[8]="Задача организации, в особенности же ";
        firstColumn[9]="Соображения высшего порядка, а также ";
        //2 столбец
        secondColumn[0]="реализация намеченных плановых заданий ";
        secondColumn[1]="рамки и место обучения кадров ";
        secondColumn[2]="постоянный количественный рост и сфера нашей активности ";
        secondColumn[3]="сложившаяся структура организации ";
        secondColumn[4]="новая модель ";
        secondColumn[5]="организационной деятельности ";
        secondColumn[6]="дальнейшее развитие различных форм деятельности ";
        secondColumn[7]="постоянное информационно-пропагандистское обеспечение нашей деятельности ";
        secondColumn[8]="укрепления и развития структуры ";
        secondColumn[9]="консультация с широким активом ";
        secondColumn[10]="начало повседневной работы по формированию позиции ";
        //3 столбец
        thirdColumn[0]="играет важную роль в формировании ";
        thirdColumn[1]="требуют от нас анализа ";
        thirdColumn[2]="требуют определения и уточнения ";
        thirdColumn[3]="способствует подготовке и реализации ";
        thirdColumn[4]="обеспечивает широкому кругу специалистов участие в формировании ";
        thirdColumn[5]="позволяет выполнить ";
        thirdColumn[6]="важнейшие задания по разработке ";
        thirdColumn[7]="в значительной степени обуславливает создание ";
        thirdColumn[8]="позволяет оценить значение ";
        thirdColumn[9]="представляет собой интересный эксперимент проверки ";
        thirdColumn[10]="влечет за собой процесс внедрения и модернизации ";
        //4 столбец
        fourthColumn[0]="существующих финансовых и административных условий.";
        fourthColumn[1]="дальнейших направлений развитая.";
        fourthColumn[2]="системы массового участия.";
        fourthColumn[3]="позиций, занимаемых участниками в отношении поставленных задач.";
        fourthColumn[4]="новых предложений.";
        fourthColumn[5]="направлений прогрессивного развития.";
        fourthColumn[6]="системы обучения кадров, соответствующей насущным потребностям.";
        fourthColumn[7]="соответствующих условий активизации.";
        fourthColumn[8]="модели развития.";
        fourthColumn[9]="форм воздействия.";
        
        System.out.println("Введите количество предложений больше 9:");
        numberOfStrings = inputData.nextInt();
        if (numberOfStrings > 9){
        for (int i=0; i<=numberOfStrings; i++){
            whatToSay += firstColumn[(int)(Math.random()*9)];
            whatToSay += secondColumn[(int)(Math.random()*10)];
            whatToSay += thirdColumn[(int)(Math.random()*10)];
            whatToSay += fourthColumn[(int)(Math.random()*9)];
            whatToSay += "\n";
        }
        System.out.println("Что сказать:");
        System.out.println(whatToSay);
        }
        
        }      
    
}