import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import {FormsModule} from "@angular/forms";
import {UserComponent} from "./user/user.component";
import {CustomerComponent} from "./customer/customer.component";

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    UserComponent,
    CustomerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
