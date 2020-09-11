import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Shoe } from '../shoe';
import { ShoeService } from '../shoe.service';

@Component({
  selector: 'app-search-shoe',
  templateUrl: './search-shoe.component.html',
  styleUrls: ['./search-shoe.component.css']
})
export class SearchShoeComponent implements OnInit {

  private shoe:Shoe;
  constructor(private shoeService:ShoeService,private router:Router) {
    this.shoe=new Shoe();
   }

   public searchShoe():void{
     this.shoeService.searchShoe(this.shoe).subscribe(res=>{
       this.shoe=new Shoe();
       this.router.navigate(['/searchShoe']);
     }
      )
   }

  ngOnInit() {
  }

}
