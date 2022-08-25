import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { SocialmediaComponent } from './components/socialmedia/socialmedia.component';
import { BannerComponent } from './components/banner/banner.component';
import { AboutmeComponent } from './components/aboutme/aboutme.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { FormacionComponent } from './components/formacion/formacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { SkillsComponent } from './components/skills/skills.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    SocialmediaComponent,
    BannerComponent,
    AboutmeComponent,
    ExperienciaComponent,
    FormacionComponent,
    SkillsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot(),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
