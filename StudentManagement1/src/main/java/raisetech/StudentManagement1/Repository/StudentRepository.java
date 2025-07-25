package raisetech.StudentManagement1.Repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.StudentManagement1.Data.Student;
import raisetech.StudentManagement1.Data.StudentsCourses;

@Mapper
public interface StudentRepository {

    @Select("SELECT * FROM students")                        //2025/07/10追加
    List<Student> search();

    @Select("SELECT * FROM students_courses")
    List<StudentsCourses> searchStudentsCourses();
}
