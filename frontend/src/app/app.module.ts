import { BrowserModule } from '@angular/platform-browser';
import {NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { AppRoutingModule } from './app.routing';

import { AppComponent } from './app.component';
import { HomepageComponent } from './component/homepage/homepage.component';
import { UtilsPipe } from './pipe/utils.pipe';
import { WelcomeComponent } from './component/welcome/welcome.component';
import {HomepageService} from "./service/homepage.service";
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { VirtualRealityComponent } from './component/virtual-reality/virtual-reality.component';
import { MachineLearningComponent } from './component/machine-learning/machine-learning.component';
import { PageNotFoundComponent } from './component/page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    WelcomeComponent,
    HeaderComponent,
    FooterComponent,
    VirtualRealityComponent,
    MachineLearningComponent,
    UtilsPipe,
    PageNotFoundComponent
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
