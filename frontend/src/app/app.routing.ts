import {RouterModule, Routes} from "@angular/router"
import {NgModule} from "@angular/core"
import {HomepageComponent} from  "./homepage/homepage.component"
import {WelcomeComponent} from "./welcome/welcome.component";


const routes: Routes = [
  {path: '', component: HomepageComponent},
  {path: '/', component: WelcomeComponent}
];
@NgModule(
  {
    imports: [RouterModule.forRoot(routes, {useHash: true})],
    exports: [RouterModule]
  }
)

export class AppRoutingModule {
}
