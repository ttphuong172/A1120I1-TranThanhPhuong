import { Component, OnInit } from '@angular/core';
import {employeeDao} from "../../dao/employeeDao";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees=employeeDao;
  constructor() { }

  ngOnInit(): void {
  }

}
