package teammates.common.datatransfer;

import java.util.ArrayList;

import teammates.common.Common;
import teammates.storage.entity.Course;

public class CourseData {
	public String id;
	public String name;
	public String coord;

	// these are marked transient because we don't want to involve them in
	// Json conversions.
	public transient int teamsTotal = Common.UNINITIALIZED_INT;
	public transient int studentsTotal = Common.UNINITIALIZED_INT;
	public transient int unregisteredTotal = Common.UNINITIALIZED_INT;
	public transient ArrayList<EvaluationData> evaluations = new ArrayList<EvaluationData>();
	public transient ArrayList<TeamData> teams = new ArrayList<TeamData>();
	public transient ArrayList<StudentData> loners = new ArrayList<StudentData>();

	public CourseData() {

	}

	public CourseData(String id, String name, String coordId) {
		this.id = id;
		this.name = name;
		this.coord = coordId;
	}

	public CourseData(Course course) {
		this.id = course.getID();
		this.name = course.getName();
		this.coord = course.getCoordinatorID();
	}

}