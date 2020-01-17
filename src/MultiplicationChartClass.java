public class MultiplicationChartClass implements MultiplicationChartInterface{

    public MultiplicationChartClass(int num) {
            
        System.out.println("---------------------------------------");
        int d;
        int e;
        for (d=1; d<=num; ++d)
        {
            for (e=1; e<=num; ++e)
            {
                System.out.print(d*e+"  ");
            }
            System.out.println();
        }

    }

    @Override
    public void displayChart() {
        
    }
}
