import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { NominationService } from '../nomination.service';

@Component({
  selector: 'app-somebody',
  templateUrl: './somebody.component.html',
  styleUrls: ['./somebody.component.css']
})
export class SomebodyComponent implements OnInit {

  nomineeSomebody = new FormGroup({
    firstName: new FormControl('', [Validators.required]),
    lastName: new FormControl('', [Validators.required,]),
    jobTitle: new FormControl('', [Validators.required,]),
    companyName: new FormControl('', [Validators.required,]),
    relationship: new FormControl('', [Validators.required,]),
    email: new FormControl('', [Validators.required,]),
    nomineefName: new FormControl('', [Validators.required,]),
    nomineelName: new FormControl('', [Validators.required,]),
    nomineeJobTitle: new FormControl('', [Validators.required,]),
    nomineeCompanyName: new FormControl('', [Validators.required,]),
    nomineeEmail: new FormControl('', [Validators.required,]),
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
    this.nomination.createSomebody(this.nomineeSomebody).subscribe(
      (res) => {
        console.log("success")
      },
      (err) => {
        console.log(err)
      },
    );
  }

}
