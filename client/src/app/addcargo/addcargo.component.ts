import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../../services/http.service';
import { AuthService } from '../../services/auth.service';


@Component({
  selector: 'app-addcargo',
  templateUrl: './addcargo.component.html',
  styleUrls: ['./addcargo.component.scss']
})
<<<<<<< HEAD
export class AddcargoComponent 
=======
export class AddcargoComponent {
  itemForm!:FormGroup;
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
 //todo: Complete missing code.. 
