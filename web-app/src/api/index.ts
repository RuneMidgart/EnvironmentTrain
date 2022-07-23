/** Generate by swagger-axios-codegen */
// @ts-nocheck
/* eslint-disable */

/** Generate by swagger-axios-codegen */
/* eslint-disable */
// @ts-nocheck
import axiosStatic, { AxiosInstance, AxiosRequestConfig } from 'axios';

export interface IRequestOptions extends AxiosRequestConfig {}

export interface IRequestConfig {
  method?: any;
  headers?: any;
  url?: any;
  data?: any;
  params?: any;
}

// Add options interface
export interface ServiceOptions {
  axios?: AxiosInstance;
}

// Add default options
export const serviceOptions: ServiceOptions = {};

// Instance selector
export function axios(configs: IRequestConfig, resolve: (p: any) => void, reject: (p: any) => void): Promise<any> {
  if (serviceOptions.axios) {
    return serviceOptions.axios
      .request(configs)
      .then(res => {
        resolve(res.data);
      })
      .catch(err => {
        reject(err);
      });
  } else {
    throw new Error('please inject yourself instance like axios  ');
  }
}

export function getConfigs(method: string, contentType: string, url: string, options: any): IRequestConfig {
  const configs: IRequestConfig = { ...options, method, url };
  configs.headers = {
    ...options.headers,
    'Content-Type': contentType
  };
  return configs;
}

export const basePath = '';

export interface IList<T> extends Array<T> {}
export interface List<T> extends Array<T> {}
export interface IDictionary<TValue> {
  [key: string]: TValue;
}
export interface Dictionary<TValue> extends IDictionary<TValue> {}

export interface IListResult<T> {
  items?: T[];
}

export class ListResultDto<T> implements IListResult<T> {
  items?: T[];
}

export interface IPagedResult<T> extends IListResult<T> {
  totalCount?: number;
  items?: T[];
}

export class PagedResultDto<T = any> implements IPagedResult<T> {
  totalCount?: number;
  items?: T[];
}

// customer definition
// empty

export class 空间区域接口Service {
  /**
   * 批量查询
   */
  static getUsingGet(
    params: {
      /** pageNum */
      pageNum?: number;
      /** pageSize */
      pageSize?: number;
      /** keyword */
      keyword?: string;
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone';

      const configs: IRequestConfig = getConfigs('get', 'application/json', url, options);
      configs.params = { pageNum: params['pageNum'], pageSize: params['pageSize'], keyword: params['keyword'] };

      /** 适配ios13，get请求不允许带body */

      axios(configs, resolve, reject);
    });
  }
  /**
   * 按照Id更新一个空间区域
   */
  static updateUsingPut(
    params: {
      /** id */
      id?: number;
      /** requestBody */
      body?: ZoneDto;
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone';

      const configs: IRequestConfig = getConfigs('put', 'application/json', url, options);
      configs.params = { id: params['id'] };

      let data = params.body;

      configs.data = data;

      axios(configs, resolve, reject);
    });
  }
  /**
   * 新增一个空间区域
   */
  static postUsingPost(
    params: {
      /** requestBody */
      body?: ZoneDto;
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone';

      const configs: IRequestConfig = getConfigs('post', 'application/json', url, options);

      let data = params.body;

      configs.data = data;

      axios(configs, resolve, reject);
    });
  }
  /**
   * 按照Id删除一个空间区域
   */
  static deleteUsingDelete(
    params: {
      /** id */
      id?: number;
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone';

      const configs: IRequestConfig = getConfigs('delete', 'application/json', url, options);
      configs.params = { id: params['id'] };

      let data = null;

      configs.data = data;

      axios(configs, resolve, reject);
    });
  }
  /**
   * 计数查询
   */
  static countUsingGet(
    params: {
      /** keyword */
      keyword?: string;
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone/count';

      const configs: IRequestConfig = getConfigs('get', 'application/json', url, options);
      configs.params = { keyword: params['keyword'] };

      /** 适配ios13，get请求不允许带body */

      axios(configs, resolve, reject);
    });
  }
  /**
   * 批量新增空间区域
   */
  static postManyUsingPost(
    params: {
      /** requestBody */
      body?: ZoneDto[];
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone/many';

      const configs: IRequestConfig = getConfigs('post', 'application/json', url, options);

      let data = params.body;

      configs.data = data;

      axios(configs, resolve, reject);
    });
  }
  /**
   * 按照Id查询
   */
  static getByIdUsingGet(
    params: {
      /** id */
      id: number;
    } = {} as any,
    options: IRequestOptions = {}
  ): Promise<any> {
    return new Promise((resolve, reject) => {
      let url = basePath + '/api/zone/{id}';
      url = url.replace('{id}', params['id'] + '');

      const configs: IRequestConfig = getConfigs('get', 'application/json', url, options);

      /** 适配ios13，get请求不允许带body */

      axios(configs, resolve, reject);
    });
  }
}

export class Future_List_ZoneDto {
  /**  */
  'cancelled'?: boolean;

  /**  */
  'done'?: boolean;

  constructor(data: undefined | any = {}) {
    this['cancelled'] = data['cancelled'];
    this['done'] = data['done'];
  }
}

export class Future_ZoneDto {
  /**  */
  'cancelled'?: boolean;

  /**  */
  'done'?: boolean;

  constructor(data: undefined | any = {}) {
    this['cancelled'] = data['cancelled'];
    this['done'] = data['done'];
  }
}

export class Future_int {
  /**  */
  'cancelled'?: boolean;

  /**  */
  'done'?: boolean;

  constructor(data: undefined | any = {}) {
    this['cancelled'] = data['cancelled'];
    this['done'] = data['done'];
  }
}

export class Future_long {
  /**  */
  'cancelled'?: boolean;

  /**  */
  'done'?: boolean;

  constructor(data: undefined | any = {}) {
    this['cancelled'] = data['cancelled'];
    this['done'] = data['done'];
  }
}

export class ZoneDto {
  /**  */
  'acCode'?: string;

  /**  */
  'name'?: string;

  /**  */
  'tempPreference'?: number;

  /**  */
  'windSpeedPreference'?: number;

  constructor(data: undefined | any = {}) {
    this['acCode'] = data['acCode'];
    this['name'] = data['name'];
    this['tempPreference'] = data['tempPreference'];
    this['windSpeedPreference'] = data['windSpeedPreference'];
  }
}
