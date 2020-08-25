package VisitorMode;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs=new LinkedList<Staff>();

    public BusinessReport(){
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师1-shaw"));
        mStaffs.add(new Engineer("工程师2-shaw"));
        mStaffs.add(new Engineer("工程师3-shaw"));
        mStaffs.add(new Engineer("工程师4-shaw"));
    }

    //为访问者添加报表
    public void showReport(Visitor visitor){
        for (Staff staff:mStaffs){
            staff.accept(visitor);
        }
    }
}
