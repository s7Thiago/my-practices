import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule, // Necessário para conectar campos do HTML com o typescript
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
