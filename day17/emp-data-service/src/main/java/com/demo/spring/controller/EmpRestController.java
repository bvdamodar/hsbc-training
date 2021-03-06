package com.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.data.EmpDb;
import com.hsbc.tr.spring.entity.Emp;

@RestController
public class EmpRestController {

	@Autowired
	private EmpDb datastore;

	// @RequestMapping(path="/emp/find/{id}",method = RequestMethod.GET,produces =
	// MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path = "/emp/find/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity getEmpDetails(@PathVariable("id") int id) {
		if (datastore.getDb().containsKey(id)) {
			return ResponseEntity.ok(datastore.getDb().get(id));
		} else {
			return ResponseEntity.ok("Emp Not Found");
		}
	}

	@GetMapping(path = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> listAll() {

		ArrayList<Emp> empList = new ArrayList<>(datastore.getDb().values());
		return ResponseEntity.ok(empList);
	}

	@PostMapping(path = "/emp/save", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Emp e) {
		if (EmpDb.getDb().containsKey(e.getEmpId())) {
			return ResponseEntity.ok("Emp already Registered....");
		} else {
			EmpDb.getDb().put(e.getEmpId(), e);
			return ResponseEntity.ok("Emp Saved SUCCESSFULLY....");
		}
	}

	@PutMapping(path = "/emp/update", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateEmp(@RequestBody Emp e) {
		if (EmpDb.getDb().containsKey(e.getEmpId())) {
			EmpDb.getDb().put(e.getEmpId(), e);
			return ResponseEntity.ok("Emp Updated....");
		} else {
			//return ResponseEntity.ok("Employee not found..");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Emp NOT Found");
		}
	}
	
	@DeleteMapping(path = "/emp/delete", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> deleteEmp(@RequestParam("empid") int id) {
		if (EmpDb.getDb().containsKey(id)) {
			EmpDb.getDb().remove(id);
			return ResponseEntity.ok("Emp Deleted....");
		} else {
			// return ResponseEntity.ok("Employee not found..");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Emp NOT Found");
		}
	}
	
}
