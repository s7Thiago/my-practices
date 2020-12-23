import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExemploDiretivasComponent } from './exemplo-diretivas.component';

describe('ExemploDiretivasComponent', () => {
  let component: ExemploDiretivasComponent;
  let fixture: ComponentFixture<ExemploDiretivasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExemploDiretivasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExemploDiretivasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
