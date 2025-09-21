@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired private EmployeeRepository repo;

    @GetMapping public List<Employee> getAll() { return repo.findAll(); }

    @PostMapping public Employee add(@RequestBody Employee e) { return repo.save(e); }
}
