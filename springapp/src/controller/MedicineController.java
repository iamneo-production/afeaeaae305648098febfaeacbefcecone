import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/medicines")
public class MedicineController{
    private List<Medicine> medicineList = new ArrayList<>();
    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine){

    }
    @PutMapping("/{medicineId}")
    public Medicine updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updateMedicine){
        
    }

}