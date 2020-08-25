package VisitorMode;

public class CEOVisitor implements Visitor {
    public void visit(Engineer engineer) {
        System.out.println("工程师"+engineer.name+"kpi:"+ engineer.kpi);
    }

    public void visit(Manager manager) {
        System.out.println("经理"+manager.name+"kpi:"+manager.kpi+"新产品数量:"+manager.getProducts());
    }
}
