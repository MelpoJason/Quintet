import { BrowserModule } from '@angular/platform-browser';
import {NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { AppRoutingModule } from './app.routing';

import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { UtilsPipe } from './pipe/utils.pipe';
import { WelcomeComponent } from './welcome/welcome.component';
import {HomepageService} from "./service/homepage.service";

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    UtilsPipe,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [HomepageService],
  bootstrap: [AppComponent],
  entryComponents:[AppComponent],
  schemas:[CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
