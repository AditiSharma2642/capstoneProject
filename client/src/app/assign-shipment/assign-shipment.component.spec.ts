import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignShipmentComponent } from './assign-shipment.component';

describe('AssignShipmentComponent', () => {
  let component: AssignShipmentComponent;
  let fixture: ComponentFixture<AssignShipmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AssignShipmentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AssignShipmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
