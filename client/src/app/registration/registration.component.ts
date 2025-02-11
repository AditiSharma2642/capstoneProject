import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
<<<<<<< HEAD
=======
import { AuthService } from '../../services/auth.service';
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import { HttpService } from '../../services/http.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
<<<<<<< HEAD
export class RegistrationComponent {

 //todo: complete missing code..

}
=======
export class RegistrationComponent implements OnInit{
itemForm!: FormGroup;
  formModel: any = { role: '', email: '', password: '', username: '' };
  showMessage: boolean = false;
  responseMessage: any;
  roles: string[] = ['Choose Role', 'BUSINESS', 'DRIVER', 'CUSTOMER'];
  showError:boolean=false;
  errorMessage:any;

  constructor(private fb: FormBuilder, private authService:AuthService, private httpService:HttpService, private router:Router) {}

  ngOnInit(): void {
    this.itemForm = this.fb.group({
      username: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      role: ['Choose Role', [Validators.required, this.validateRole]]
    });
  }

  validateRole(control: any) {
    return control.value === 'Choose Role' ? { invalidRole: true } : null;
  }

  onRegister(): void {
   if(this.itemForm.valid)
     {
       this.showError=false;
       this.showMessage=false;
       this.httpService.registerUser(this.itemForm.value).subscribe(data=>{
         this.showMessage=true;
         this.responseMessage='Hi '+data.name +", you have successfully registered!";
         this.itemForm.reset();
         
       },error=>{
         this.showError=true;
         this.errorMessage=error.error})
     }
     else{
       this.itemForm.markAllAsTouched();
     }
  }
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
