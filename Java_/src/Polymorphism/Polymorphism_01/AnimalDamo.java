package Polymorphism.Polymorphism_01;
/**測試類 */
public class AnimalDamo {
    public static void main(String[] args) {
        //父類引用子類對象
        // 成員變量>>編譯看左邊，運行看左邊
        // 成員方法>>編譯看左邊，執行看右邊 >> 多態>可以用父類對象點子類方法，但不能訪問子類特有的方法
        // 成員方法有重寫，成員變量沒有
        Animal a = new Cat();

        System.out.println(a.age);        //輸出的是>父類對象的值
        // System.out.println(a.weight);  //err 因父類對象裡沒有同名變數

        a.eat();            //輸出>子類重寫後的方法
        // a.playGame();    //err 
    }
}
