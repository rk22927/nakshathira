import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'nakshatraawards';
  navigation: string[] = ['Home', 'Nominations', 'Speakers', 'Jury', 'Partners', 'Contact Us'];
  categoryList = [
    { label: 'Agriculture', checked: false },
    { label: 'Food', checked: false },
    { label: 'Health Care', checked: false },
    { label: 'Home Retail', checked: false },
    { label: 'Arts & Culture', checked: false },
    { label: 'Sports & Fitness', checked: false },
    { label: 'Breaking Stereotype', checked: false },
    { label: 'Beauty & Wellness', checked: false },
    { label: 'Social Activism/ Self Help Group', checked: false },
    { label: 'Education & Literature', checked: false },
    { label: 'Media & Entertainment', checked: false }
  ];
  lastAction: string;
  checked_array: any = [];

  onChange(event, index, item) {
    item.checked = !item.checked;
    this.lastAction = 'index: ' + index + ', label: ' + item.label + ', checked: ' + item.checked;
    if (item.checked) {
      this.checked_array.push(item.label)
    } else {
      const index: number = this.checked_array.indexOf(item.label);
      if (index !== -1) {
        this.checked_array.splice(index, 1);
      }
    }
  }

  checkDisabled(label) {
    if (this.checked_array.length > 1) {
      return true;
    }
    else if (this.checked_array.length == 0) {
      return false;
    }
    else {
      const index: number = this.checked_array.indexOf(label);
      if (index !== -1) {
        return false;
      } else if (this.checked_array.length == 2) {
        return true;
      }
      else {
        return false;
      }
    }
  }


}
