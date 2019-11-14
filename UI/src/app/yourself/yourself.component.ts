import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { NominationService } from '../nomination.service';

@Component({
  selector: 'app-yourself',
  templateUrl: './yourself.component.html',
  styleUrls: ['./yourself.component.css']
})
export class YourselfComponent implements OnInit {

  nomineeMySelf = new FormGroup({
    firstName: new FormControl('', [Validators.required]),
    lastName: new FormControl('', [Validators.required,]),
    jobTitle: new FormControl('', [Validators.required,]),
    companyName: new FormControl('', [Validators.required,]),
    email: new FormControl('', [Validators.required,]),
    phoneNumber: new FormControl('', [Validators.required,]),
    website: new FormControl('', [Validators.required,]),
    facebook: new FormControl('', [Validators.required,]),
    linkedIn: new FormControl('', [Validators.required,]),
    dob: new FormControl('', [Validators.required,]),
    reasonForNominee: new FormControl('', [Validators.required,]),
  });
  constructor(private nomination: NominationService) { }

  ngOnInit() {

  }

  onSubmit() {
    this.nomination.createCustomer(this.nomineeMySelf.value).subscribe(
      (res) => {
        console.log("success")
      },
      (err) => {
        console.log(err)
      },
    );
  }
}
