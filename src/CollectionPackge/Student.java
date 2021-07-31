package CollectionPackge;

import java.util.Objects;

public class Student {
	
	private int Id;
	private String Name;
	private String CollegeName;

public Student(int Id, String Name, String CollegeName) 
	{
	this.Id = Id;
	this.Name = Name;
	this.CollegeName = CollegeName;
	}

@Override
public String toString() {
	return "Student [Id=" + Id + ", Name=" + Name + ", CollegeName=" + CollegeName + "]";
}

@Override
public int hashCode() {
	return Objects.hash(CollegeName, Id, Name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof Student)) {
		return false;
	}
	Student other = (Student) obj;
	return Objects.equals(CollegeName, other.CollegeName) && Id == other.Id && Objects.equals(Name, other.Name);
}

}