import { Component, OnInit, Input  } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService } from "../shared/rest-api.service";

@Component({
  selector: 'app-user-create',
  templateUrl: './user-create.component.html',
  styleUrls: ['./user-create.component.css']
})
export class UserCreateComponent implements OnInit {

  @Input() userDetails = { name: '', idNumber: 0, telephoneNumber: '' }

  constructor(public restApi: RestApiService, 
    public router: Router) { }

  ngOnInit(): void {
  }

  addUser(dataUser) {
    this.restApi.createUser(this.userDetails).subscribe((data: {}) => {
      this.router.navigate(['/user-list'])
    })
  }

}
