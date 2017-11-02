import {RouterModule, Routes} from "@angular/router"
import {NgModule} from "@angular/core"
import {HomepageComponent} from  "./component/homepage/homepage.component"
import {WelcomeComponent} from "./component/welcome/welcome.component";
import {PageNotFoundComponent} from "./component/page-not-found/page-not-found.component";
import {VirtualRealityComponent} from "./component/virtual-reality/virtual-reality.component";
import {MachineLearningComponent} from "./component/machine-learning/machine-learning.component";


const appRoutes: Routes = [
  {path: '', component: WelcomeComponent},
  {path: 'homepage', component: HomepageComponent},
  {path: 'virtual-reality', component: VirtualRealityComponent},
  {path: 'machine-learning', component: MachineLearningComponent},
  {path: '**', component: PageNotFoundComponent}
];
@NgModule(
  {
    imports: [RouterModule.forRoot(appRoutes, {useHash: true})],
    exports: [RouterModule]
  }
)

export class AppRoutingModule {
}
