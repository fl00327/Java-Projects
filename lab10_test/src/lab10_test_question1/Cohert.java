package lab10_test_question1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cohert {
private Programme programme = null;
private List<IStudent> students = null;
private Date startDate = null;

public Cohert(Programme programme, Date startDate){
	super();
	this.programme = programme;
	this.startDate = startDate;
	this.students = new ArrayList<IStudent>();
}
}
