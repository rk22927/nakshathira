import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SomebodyComponent } from './somebody.component';

describe('SomebodyComponent', () => {
  let component: SomebodyComponent;
  let fixture: ComponentFixture<SomebodyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SomebodyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SomebodyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
