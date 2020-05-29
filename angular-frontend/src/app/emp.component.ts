import { Component, OnInit } from '@angular/core';
import { Employee } from './model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css']
})

export class EmployeesComponent implements OnInit {

  /*heroes = HEROES;  fetched by service*/
  selectedEmployee: Employee;

  constructor() { }

  ngOnInit() {
  }

  onSelect(e: Employee): void {
    this.selectedEmployee = e;
  }
}