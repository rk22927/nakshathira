import { TestBed } from '@angular/core/testing';

import { NominationService } from './nomination.service';

describe('NominationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: NominationService = TestBed.get(NominationService);
    expect(service).toBeTruthy();
  });
});
