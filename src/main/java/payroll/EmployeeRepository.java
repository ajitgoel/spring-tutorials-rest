package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
//used to access data by declaring following interface for employee domain type and employee domain type's id type
interface EmployeeRepository extends JpaRepository<Employee, Long> {
}