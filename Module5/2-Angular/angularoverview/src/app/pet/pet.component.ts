import { Component, OnInit } from '@angular/core';
import {IPet} from "../pet";


@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})

export class PetComponent implements OnInit {

   pet1:IPet={
    name:"Nota", image:"data:image/jpeg;base64,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"
  }

  public petName="puppie";
  public petImage="http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg";
  constructor() { }

  ngOnInit(): void {
  }
  updateName(e:any){
    this.pet1.name=e.target.value;
  }
  updateImage(e:any){
    this.pet1.image=e.target.value;
  }

}
